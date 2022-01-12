@java.lang.Override
public void onClick(android.view.View view) {
    if ((drink) == 0) {
        dialogDrinkAccepted.show();
        buttonOK.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View view) {
                dialogDrinkAccepted.dismiss();
                winnerDrink = 1;
                finishDialogChooseDrink(position2);
            }
        });
        buttonCancel.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View view) {
                dialogDrinkAccepted.dismiss();
            }
        });
    }
}