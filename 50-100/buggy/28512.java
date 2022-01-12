@org.junit.Test
public void testSinglyLinkedList() {
    java.lang.String filename = "sll.als";
    java.lang.String commandName = "SinglyLinkedLists";
    java.io.File filepath = new java.io.File(edu.uw.ece.bordeaux.tests.BordeauxEngineTest.BORDEUX_MODELS_DIRECTORY, filename);
    edu.uw.ece.bordeaux.HolaReporter reporter = new edu.uw.ece.bordeaux.HolaReporter();
    edu.uw.ece.bordeaux.engine.BordeauxEngine engine = edu.uw.ece.bordeaux.tests.BordeauxEngineTest.createBordeauxEngine(reporter, filepath, commandName);
    testNextMiss(reporter, commandName, filepath, engine, 40);
}