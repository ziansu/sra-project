public static net.filebot.similarity.SimilarityMetric[] defaultSequence(boolean includeFileMetrics) {
    if (includeFileMetrics) {
        return new net.filebot.similarity.SimilarityMetric[]{ net.filebot.similarity.EpisodeMetrics.FileSize , new net.filebot.similarity.MetricCascade(net.filebot.similarity.EpisodeMetrics.FileName, net.filebot.similarity.EpisodeMetrics.EpisodeFunnel) , net.filebot.similarity.EpisodeMetrics.EpisodeBalancer , net.filebot.similarity.EpisodeMetrics.AirDate , net.filebot.similarity.EpisodeMetrics.MetaAttributes , net.filebot.similarity.EpisodeMetrics.SubstringFields , net.filebot.similarity.EpisodeMetrics.NameBalancer , net.filebot.similarity.EpisodeMetrics.Numeric , net.filebot.similarity.EpisodeMetrics.NumericSequence , net.filebot.similarity.EpisodeMetrics.SeriesName , net.filebot.similarity.EpisodeMetrics.RegionHint , net.filebot.similarity.EpisodeMetrics.SeriesRating , net.filebot.similarity.EpisodeMetrics.TimeStamp , net.filebot.similarity.EpisodeMetrics.AbsolutePath };
    }else {
        return new net.filebot.similarity.SimilarityMetric[]{ net.filebot.similarity.EpisodeMetrics.EpisodeFunnel , net.filebot.similarity.EpisodeMetrics.EpisodeBalancer , net.filebot.similarity.EpisodeMetrics.AirDate , net.filebot.similarity.EpisodeMetrics.MetaAttributes , net.filebot.similarity.EpisodeMetrics.SubstringFields , net.filebot.similarity.EpisodeMetrics.NameBalancer , net.filebot.similarity.EpisodeMetrics.Numeric , net.filebot.similarity.EpisodeMetrics.NumericSequence , net.filebot.similarity.EpisodeMetrics.SeriesName , net.filebot.similarity.EpisodeMetrics.RegionHint , net.filebot.similarity.EpisodeMetrics.SeriesRating , net.filebot.similarity.EpisodeMetrics.TimeStamp , net.filebot.similarity.EpisodeMetrics.AbsolutePath };
    }
}