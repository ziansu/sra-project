protected static void acceptTagAction(com.github.dakusui.actionunit.visitors.With.Tag tagAction, com.github.dakusui.actionunit.visitors.With withAction, com.github.dakusui.actionunit.visitors.ActionRunner runner) {
    tagAction.toLeaf(withAction.source(), withAction.getSinks(), runner).accept(runner);
}