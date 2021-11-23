@java.lang.Override
public void onNonValidLine(au.id.villar.rir.NonValidLine error) {
    (counter.count)++;
    (counter.nonValidLineCount)++;
    java.lang.System.out.println(("Error line: " + (error.fields())));
}