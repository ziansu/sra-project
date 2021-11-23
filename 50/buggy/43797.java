@java.lang.Override
public void error(java.lang.Exception e) {
    java.lang.System.err.println(e.toString());
    view().render(new com.nazacheres.onlinetrends.screens.start.StartModel.WhatPopularLoadingFailedState(R.string.errorcancelingprocess));
}