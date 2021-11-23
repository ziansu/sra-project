@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle arguments = getArguments();
    if ((arguments != null) && ((number) == (-1))) {
        number = arguments.getInt(de.schueler.layoutviewsdemo.fragment.NumberDetailFragment.KEY_NUMBER, (-1));
        if ((number) == (-1)) {
            throw new java.lang.RuntimeException("You have to use newInstance to instantiate the fragment");
        }
    }
    created = true;
    changeNumber(number);
}