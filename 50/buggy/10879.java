private void btnLocalMultiplayerClicked() {
    startActivity(new android.content.Intent(this, com.vintagetechnologies.menschaergeredichnicht.Spieloberflaeche.class));
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.getInstance().setLocalGame(true);
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.getInstance().reset();
}