public android.os.Bundle putParent(android.os.Parcelable superState) {
    android.os.Bundle state = new android.os.Bundle();
    state.putParcelable(((baseKey) + "$$SUPER"), superState);
    return state;
}