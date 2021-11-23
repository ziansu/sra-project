protected java.lang.String mapAnswerValue(java.lang.String answer) {
    if (answer == "difficult") {
        return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.DIFFICULT;
    }else
        if (answer == "boring") {
            return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.BORING;
        }else
            if (answer == "long") {
                return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.LONG;
            }else {
                return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.OTHER;
            }
        
    
}