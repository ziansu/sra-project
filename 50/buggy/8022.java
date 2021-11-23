public rheat.GUI.Helix getSelectedHelix() {
    rheat.GUI.Helix result = null;
    if ((helixImgGen) != null) {
        result = helixImgGen.getSelectedHelix();
    }
    return result;
}