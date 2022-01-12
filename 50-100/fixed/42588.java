public void addToAgeGroup(nycschool.com.example.ezraerani.myapplication.AfterSchoolActivity activity) {
    if (!(ageGroupHashMap.containsKey(activity.getAgeGroup()))) {
        if ((activity.getAgeGroup()) != null) {
            ageGroupHashMap.put(activity.getAgeGroup(), new java.util.ArrayList<nycschool.com.example.ezraerani.myapplication.AfterSchoolActivity>());
            ageGroupHashMap.get(activity.getAgeGroup()).add(activity);
        }
    }else {
        ageGroupHashMap.get(activity.getAgeGroup()).add(activity);
    }
}