public void test_2_step() {
    xmlConversion.ConvertToBpmn convert = new xmlConversion.ConvertToBpmn();
    bpmnStructure.BpmnDiagram diagram = convert.importXML("tests/diagrams/2_step.bpmn");
    bpmnStructure.BpmnDiagram correct;
    correct = new bpmnStructure.BpmnDiagram("Process_1");
    correct.addStartEvent("StartEvent_1");
    correct.addEndEvent("EndEvent_1aqgj4v");
    correct.addSequenceFlow("StartEvent_1", "EndEvent_1aqgj4v");
    java.lang.System.out.print("Testing: ");
    java.lang.System.out.println(correct.equals(diagram));
}