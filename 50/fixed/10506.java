@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((this.language) != null) {
        outState.putInt("CURRENT_LANG", this.language.getId());
        super.onSaveInstanceState(outState);
    }
}