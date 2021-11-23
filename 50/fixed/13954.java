private void CheckForBrewDisplay() {
    if ((getActivity().getLocalClassName().contains("Brews.UserBrew")) || (getActivity().getLocalClassName().contains("Global.UserGlobal")))
        isBrewDisplay = true;
    
}