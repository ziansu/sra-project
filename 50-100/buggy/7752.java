@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    if (language.equalsIgnoreCase("japanese"))
        japExecute();
    else
        if (language.equalsIgnoreCase("mandarin")) {
            if (addedDict)
                chineseExecute();
            else {
                addChineseDictionary();
                chineseExecute();
            }
        }else
            if (language.equalsIgnoreCase("korean"))
                try {
                    koreanExecute();
                } catch (java.lang.Exception e) {
                    java.lang.System.out.println(("Error " + e));
                }
            
        
    
    return null;
}