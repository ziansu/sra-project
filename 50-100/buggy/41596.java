@java.lang.SuppressWarnings(value = "unused")
public void enter(at.caseapps.matcha.Action action) {
    android.content.Context context = getCurrentContext();
    at.caseapps.matcha.Action.EnterAction enterAction = ((at.caseapps.matcha.Action.EnterAction) (action));
    org.hamcrest.Matcher<android.view.View> viewMatcher = getViewMatcher(action, context);
    android.support.test.espresso.Espresso.onView(viewMatcher).perform(new at.caseapps.matcha.EspressoRunner.SetTextAction(enterAction.value));
}