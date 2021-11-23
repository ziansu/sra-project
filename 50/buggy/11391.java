@org.junit.Before
public void before() {
    aapl = new hu.farago.wsj.controller.dto.CompanyInfoDTO("AAPL", com.google.common.collect.Lists.newArrayList("AAPL", "APPLE INC", "APPLE INCORP"));
    adbe = new hu.farago.wsj.controller.dto.CompanyInfoDTO("ADBE", com.google.common.collect.Lists.newArrayList("ADBE", "ADOBE SYSTEMS INC", "ADOBE SYSTEM"));
}