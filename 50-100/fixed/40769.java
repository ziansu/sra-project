@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    final java.lang.String amountString = ((android.widget.EditText) (dialog.findViewById(R.id.amount_editText))).getText().toString().replace("%", "").replace(" ", "");
    try {
        int amount = java.lang.Integer.parseInt(amountString);
        feedingEntry.setAmount((amount <= 100 ? amount : 100));
    } finally {
        feedingEntryRef.setValue(feedingEntry);
    }
}