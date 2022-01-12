@org.junit.Test
public void SaveCourse() {
    java.util.UUID uuid = java.util.UUID.randomUUID();
    OTS.Aig.KnowledgeMapDataServices.CourseElement courseElement = new OTS.Aig.KnowledgeMapDataServices.CourseElement();
    courseElement.Id = uuid.toString();
    courseElement.Name = "Testing and Test";
    courseElement.Createdby = 2;
    OTS.Aig.KnowledgeMapDataServices.CourseDataService courseDataService = new OTS.Aig.KnowledgeMapDataServices.CourseDataService(new OTS.DataModels.MySqlDataSource());
    OTS.Aig.KnowledgeMapDataServices.TransactionResult result = courseDataService.CreateNewCourse(courseElement);
    org.eclipse.persistence.jpa.jpql.Assert.isTrue(((result.ActionResultType) == (OTS.Aig.KnowledgeMapDataServices.ActionResultType.ok)), "");
}