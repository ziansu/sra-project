@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_bet_acept :
            bet = 1;
            android.util.Log.d("Estamos en ", "el boton de aposta'00000000000000000000000000000000000000000000000000000000r");
            communication.sendBet(bet);
            break;
    }
}