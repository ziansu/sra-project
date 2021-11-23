public int getFirstOrderCost(int cost, int sid) {
    Service.SchoolConfigs sc = getSchoolConfBySchoolId(sid);
    int res = sc.getFirst_cost();
    return res < cost ? cost : res;
}