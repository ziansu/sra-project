@java.lang.Override
public void done(com.parse.ParseObject parseObject, com.parse.ParseException e) {
    if (e == null) {
        java.lang.System.out.println("null score");
        com.parse.ParseObject userscore = new com.parse.ParseObject("Scores");
        userscore.put("score", com.cards.flash.testez.TallyScore.getScore());
        userscore.put("user", com.parse.ParseUser.getCurrentUser());
        saveScoreObject(userscore);
        com.cards.flash.testez.TallyScore.resetScore();
    }else {
    }
}