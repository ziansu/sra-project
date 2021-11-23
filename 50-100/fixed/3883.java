public void sucessfullyCon() {
    if (!(_succesfull)) {
        if (!(_waiting))
            renewPanel();
        
        _retry.setVisible(false);
        _conPanel.setVisible(true);
        _succesfull = true;
        _waiting = false;
        _icon.setImage(org.jivesoftware.resource.SparkRes.getImageIcon(SparkRes.SMALL_CHECK).getImage());
        _label.setText(org.jivesoftware.spark.otrplug.util.OTRResources.getString("otr.successfull"));
    }
}