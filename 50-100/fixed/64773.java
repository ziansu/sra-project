@java.lang.Override
public void handle(java.lang.String user, java.lang.String msg) {
    java.lang.System.out.println("Check jobs Activity ...");
    com.samczsun.skype4j.Skype skype = com.epam.hackaton.bot.skype.BotSingleton.getSkypeInstance();
    java.lang.String resultOfChecking = getJobsResult();
    if (com.epam.hackaton.bot.activities.wb.CheckJobsBackgroundActivity.UNSUCCESSFUL_RESULT.contains(resultOfChecking)) {
        java.lang.System.out.println(resultOfChecking);
    }else {
        com.epam.hackaton.bot.skype.BotSingleton.informUser("Result");
        com.epam.hackaton.utilities.speech.SpeechUtils.speakMsg("Found!");
        com.epam.hackaton.bot.skype.BotUtils.sendMessage(skype, "(monkey)");
        com.epam.hackaton.bot.skype.BotUtils.sendMessage(skype, resultOfChecking);
    }
}