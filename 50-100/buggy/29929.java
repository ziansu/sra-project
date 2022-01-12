public static test.klq.logic.controller.Question q4() {
    test.klq.logic.controller.Id id = new test.klq.logic.controller.Id("question4");
    test.klq.logic.controller.OptionSet optionSet = new test.klq.logic.controller.OptionSet();
    optionSet.add(new test.klq.logic.controller.Answer("Example Answer"));
    test.klq.logic.controller.Text text = new test.klq.logic.controller.Text("This is a question, that is even more long!?");
    test.klq.logic.controller.Question q = new test.klq.logic.controller.Question(id, Type.STRING, optionSet, text, null);
    return q;
}