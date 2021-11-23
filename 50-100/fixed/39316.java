public static java.time.ZonedDateTime updateDateTime(java.time.ZonedDateTime value, float range) {
    range = (range != 0) ? range : 10;
    if (range < 0)
        return value;
    
    float days = org.pipservices.commons.random.RandomFloat.nextFloat((-range), range);
    return value.plusDays(((int) (days)));
}