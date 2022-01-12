private eu.geekhome.asymptote.model.ParamSyncUpdate findParamSyncUpdate(int index, java.util.ArrayList<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    if ((updates.size()) > 0) {
        for (eu.geekhome.asymptote.model.SyncUpdate syncUpdate : updates) {
            if (syncUpdate instanceof eu.geekhome.asymptote.model.ParamSyncUpdate) {
                eu.geekhome.asymptote.model.ParamValue paramValue = ((eu.geekhome.asymptote.model.ParamSyncUpdate) (syncUpdate)).getValue();
                if ((paramValue.getIndex()) == index) {
                    return ((eu.geekhome.asymptote.model.ParamSyncUpdate) (syncUpdate));
                }
            }
        }
    }
    return null;
}