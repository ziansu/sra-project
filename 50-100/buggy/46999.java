void ShowUI() {
    android.widget.Toast.makeText(this, ("stan " + (_uiShowed)), Toast.LENGTH_SHORT).show();
    _topMenu.setVisibility((_uiShowed ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    _bottoMenu.setVisibility((_uiShowed ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    _scrollPanel.setVisibility((_uiShowed ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    _uiShowed = !(_uiShowed);
}