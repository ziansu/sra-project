@org.springframework.web.bind.annotation.PostMapping(value = "/stats")
public java.lang.Object getStats(@org.springframework.web.bind.annotation.RequestBody
kr.ac.yonsei.fyea.web.model.StatsQueryModel queryModel) {
    return kr.ac.yonsei.fyea.util.StatsDataUtils.getStatistics(statsService.getStatsQueryData(queryModel));
}