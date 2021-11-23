public void setEvents(modularity.coderdojoevents.Api.EventBrite.Response.BriteEvent events) {
    if (events != null)
        getEditor().putString(modularity.coderdojoevents.Settings.DojoSettings.KEY_EVENTS, modularity.coderdojoevents.Utils.Json.to(events)).commit();
    
}