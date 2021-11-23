private org.daisy.pipeline.gui.databridge.ScriptFieldAnswer createAnswer(org.daisy.pipeline.gui.databridge.ScriptField field) {
    org.daisy.pipeline.gui.databridge.ScriptFieldAnswer answer;
    if ((field.getDataType()) == (org.daisy.pipeline.gui.databridge.ScriptField.DataType.BOOLEAN)) {
        answer = new org.daisy.pipeline.gui.databridge.ScriptFieldAnswer.ScriptFieldAnswerBoolean(field);
    }else {
        if ((field.isSequence()) == true) {
            answer = new org.daisy.pipeline.gui.databridge.ScriptFieldAnswer.ScriptFieldAnswerList(field);
        }else {
            answer = new org.daisy.pipeline.gui.databridge.ScriptFieldAnswer.ScriptFieldAnswerString(field);
        }
    }
    return answer;
}