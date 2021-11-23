@org.junit.Test
public void sl0001() throws java.lang.Exception {
    org.acsool.dto.APICode reqCode = new org.acsool.dto.APICode();
    reqCode.tranCd = "SL0001";
    org.acsool.dto.SL0001 sl = new org.acsool.dto.SL0001();
    sl.slNo = "1";
    sl.artContent = "hello world";
    sl.artZanMaxCnt = 5;
    reqCode.tranData = sl;
    java.lang.System.out.println(org.acsool.utils.JacksonUtils.<org.acsool.dto.APICode<org.acsool.dto.SL0001>>objectToJson(reqCode));
    this.<org.acsool.dto.SL0001>printJson(reqCode);
}