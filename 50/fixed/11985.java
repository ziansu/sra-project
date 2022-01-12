@java.lang.Override
public void onResponse(java.lang.String response) {
    if (type.equals(org.md2k.study.model_view.day_start_end.DayStartEndInfoManager.DAY_START))
        setDayStartTime(org.md2k.datakitapi.time.DateTime.getDateTime());
    else
        if (type.equals(org.md2k.study.model_view.day_start_end.DayStartEndInfoManager.DAY_END))
            setDayEndTime(org.md2k.datakitapi.time.DateTime.getDateTime());
        
    
}