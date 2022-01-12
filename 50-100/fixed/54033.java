public void run() {
    fr.umlv.unitex.TextDicFrame.hideFrame();
    fr.umlv.unitex.MultiCommands commands;
    if (fr.umlv.unitex.Config.isAgglutinativeLanguage()) {
        commands = getRunCmdForAgglutinativeLanguages();
    }else {
        commands = getRunCmdForNonAgglutinativeLanguages();
    }
    if ((commands.numberOfCommands()) == 0)
        return ;
    
    new fr.umlv.unitex.ProcessInfoFrame(commands, true, new fr.umlv.unitex.ApplyLexicalResourcesFrame.ApplyLexicalResourcesDo());
}