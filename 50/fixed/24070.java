public static int GetPlayerContinentsValueSum(data.Territory.Player player) {
    int sum = 0;
    for (data.Continent c : data.World.continents) {
        if (c.OwnedBy().equals(player)) {
            sum += c.GetEnforcementValue();
        }
    }
    return sum;
}