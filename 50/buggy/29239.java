@java.lang.Override
public void finish(java.util.LinkedList<com.nazacheres.onlinetrends.utils.youtubecore.PopularTag> list) {
    view().render(new com.nazacheres.onlinetrends.screens.start.StartModel.WhatPopularLoadedState(list));
}