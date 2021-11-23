@java.lang.Override
public void onValidation(fr.noop.subtitle.model.ValidationIssue event) {
    (count)++;
    java.lang.System.out.println(event.toString());
}