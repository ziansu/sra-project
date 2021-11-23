@org.junit.Before
public void setup() {
    when(dynamoDBMapper.scan(org.mockito.Matchers.eq(com.romcharm.domain.mypage.Project.class), org.mockito.Matchers.any(com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression.class))).thenReturn(projectPaginatedScanList);
}