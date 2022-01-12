public void setRemainTime(org.bitbucket.ucchy.fnafim.game.Night night, int hour) {
    java.lang.String title = org.bitbucket.ucchy.fnafim.Messages.get("Sidebar_Title", new java.lang.String[]{ "%night" , "%hour" }, new java.lang.String[]{ night.toString() , java.lang.String.format("%2d", hour) });
    if (!(title.equals(this.title))) {
        setTitle(title);
    }
}