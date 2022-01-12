@org.junit.Test
public void testConversionToEureka2xDataCenterInfo() throws java.lang.Exception {
    com.netflix.eureka2.registry.datacenter.AwsDataCenterInfo v2DataCenterInfo = SampleAwsDataCenterInfo.UsEast1a.build();
    com.netflix.appinfo.AmazonInfo v1DataCenterInfo = com.netflix.eureka2.eureka1.utils.Eureka1ModelConverters.toEureka1xDataCenterInfo(v2DataCenterInfo);
    com.netflix.eureka2.registry.datacenter.AwsDataCenterInfo mappedV2DataCenterInfo = ((com.netflix.eureka2.registry.datacenter.AwsDataCenterInfo) (com.netflix.eureka2.eureka1.utils.Eureka1ModelConverters.toEureka2xDataCenterInfo(v1DataCenterInfo)));
    com.netflix.eureka2.eureka1.utils.Eureka1ModelConvertersTest.verifyDataCenterInfoMapping(v2DataCenterInfo, mappedV2DataCenterInfo);
}