@java.lang.Override
public void updateProgress(java.lang.String state) {
    if ((view()) != null) {
        view().render(new com.nazacheres.onlinetrends.screens.start.StartModel.WhatPopularLoadingState(state, null));
    }
}