@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent PCE) {
    java.lang.String event = PCE.getPropertyName();
    if (event == (utils.Constants.START_GAME)) {
        increment_round();
    }else
        if ((event == (utils.Constants.REMOVE_PLAYER)) || (event == (utils.Constants.IO_REMOVE_PLAYER))) {
            remove_player(PCE);
        }else
            if (event == (utils.Constants.END_ALL_GAMES)) {
                utils.DataWriter.write_data("data.csv", this);
            }else
                if (event == (utils.Constants.WRITE_DATA)) {
                    utils.DataWriter.write_data("data.csv", this);
                }
            
        
    
}