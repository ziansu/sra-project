@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.os.Bundle args = getArguments();
    int year = args.getInt(de.haw.yumiii.supercalendar.utils.DatePickerFragment.ARG_YEAR);
    int month = args.getInt(de.haw.yumiii.supercalendar.utils.DatePickerFragment.ARG_MONTH);
    int day = args.getInt(de.haw.yumiii.supercalendar.utils.DatePickerFragment.ARG_DAY);
    return new android.app.DatePickerDialog(getActivity(), this, year, (month - 1), day);
}