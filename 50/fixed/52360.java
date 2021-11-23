@org.skife.jdbi.v2.sqlobject.GetGeneratedKeys
@org.skife.jdbi.v2.sqlobject.SqlUpdate(value = "insert into subscrProduct (complJson, startDate, endDate, nextDelivery) " + " values (:complJson, :startDate, :endDate, :nextDelivery)")
long insertSubscrProduct(@org.skife.jdbi.v2.sqlobject.BindBean
net.buchlese.bofc.api.subscr.SubscrProduct p);