@org.skife.jdbi.v2.sqlobject.SqlUpdate(value = "INSERT INTO Feedback (feature, improvement, miscellaneous) VALUES(:feature, :improvement, :miscellaneous)")
@org.skife.jdbi.v2.sqlobject.GetGeneratedKeys
public long addFeedback(@org.skife.jdbi.v2.sqlobject.Bind(value = "feature")
java.lang.String feedback, @org.skife.jdbi.v2.sqlobject.Bind(value = "improvement")
java.lang.String improvement, @org.skife.jdbi.v2.sqlobject.Bind(value = "miscellaneous")
java.lang.String miscellanoues);