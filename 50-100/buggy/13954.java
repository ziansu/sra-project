public static com.example.stled.flowfinder2.data.USState getUSStateText(final java.lang.String abbrev) {
    com.example.stled.flowfinder2.data.USState[] values = com.example.stled.flowfinder2.data.USState.values();
    for (com.example.stled.flowfinder2.data.USState usState : values) {
        if (usState.getAbbrev().equals(abbrev))
            return usState;
        
    }
    android.util.Log.v("STATE: ", "Not Found");
    return null;
}