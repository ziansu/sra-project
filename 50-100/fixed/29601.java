private char[] getDefaultTriggerChars() {
    java.lang.String triggerChars = "";
    for (java.lang.String seq : org.xtuml.bp.ui.text.contentassist.OALCompletionProcessor.getTriggerSequences()) {
        if (!("".equals(seq))) {
            char lastChar = seq.charAt(((seq.length()) - 1));
            if ((-1) == (triggerChars.indexOf(lastChar)))
                triggerChars += java.lang.Character.toString(lastChar);
            
        }
    }
    return triggerChars.toCharArray();
}