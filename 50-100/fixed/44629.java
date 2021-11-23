protected java.lang.String mapAnswerValue(java.lang.String answer) {
    answer = answer.toLowerCase();
    if (answer.equals("difficult")) {
        return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.DIFFICULT;
    }else
        if (answer.equals("boring")) {
            return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.BORING;
        }else
            if (answer.equals("long")) {
                return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.LONG;
            }else {
                return edu.uci.ics.sdcl.firefly.servlet.QuitServlet.OTHER;
            }
        
    
}