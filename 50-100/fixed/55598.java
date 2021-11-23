public void AddUnitGroup(Units.UnitGroup group) {
    java.lang.System.out.println("BEGIN PlayerData.AddUnitGroup");
    if ((group_count) >= (max_group_count)) {
        Units.UnitGroup[] temp = groups;
        max_group_count *= 2;
        groups = new Units.UnitGroup[max_group_count];
        for (int i = 0; i < (group_count); i++)
            groups[i] = temp[i];
        
    }
    groups[group_count] = group;
    (group_count)++;
    java.lang.System.out.println("END PlayerData.AddUnitGroup");
}