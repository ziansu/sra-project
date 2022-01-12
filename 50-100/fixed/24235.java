@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.bNext :
            game.initCards();
            game.initPlayerBet();
            com.glacial.p0x4.general.UtilsFragments.goNext(getActivity().getSupportFragmentManager(), game);
            break;
    }
}