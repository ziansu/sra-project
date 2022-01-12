@butterknife.OnClick(value = R.id.btnNext)
public void onNextClick() {
    if (validateSchoolName()) {
        com.media2359.mediacorpspellinggame.factory.GameProgressManager.getInstance().setSchoolName(etSchoolName.getText().toString().trim());
        com.media2359.mediacorpspellinggame.data.Section firstGame = com.media2359.mediacorpspellinggame.factory.GameRepo.getInstance().getSection(4);
        com.media2359.mediacorpspellinggame.game.GameActivity.startGameActivity(this, firstGame);
        finish();
    }
}