@schicwp.hikeplanner.dal.impl.SqlUpdate(value = "update location set latitude=:latitude,longitude=:longitude where id=:locationId")
void updateLocation(@schicwp.hikeplanner.dal.impl.Bind(value = "locationId")
long id, @schicwp.hikeplanner.dal.impl.BindBean
schicwp.hikeplanner.dal.Location locationEntity);