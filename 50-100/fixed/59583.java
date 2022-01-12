public static test.klq.logic.controller.Question q5() {
    test.klq.logic.controller.Id id = new test.klq.logic.controller.Id("question5");
    test.klq.logic.controller.OptionSet optionSet = new test.klq.logic.controller.OptionSet();
    optionSet.add(new java.lang.String("So n grote Feuerball!"));
    optionSet.add(new java.lang.String("BAM"));
    test.klq.logic.controller.Text text = new test.klq.logic.controller.Text("New Kids?");
    test.klq.logic.controller.Question q = new test.klq.logic.controller.Question(id, Type.SET, optionSet, text, null);
    return q;
}