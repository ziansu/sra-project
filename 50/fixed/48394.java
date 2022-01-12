public void init() {
    fileName = "";
    formCompleted = true;
    fileStream = null;
    counter = 0;
    rulesList = new java.util.ArrayList<org.ruleEditor.utils.Rule>();
    selectedRule = new org.ruleEditor.utils.Rule("", "", null, (-1));
}