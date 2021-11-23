public com.thorpora.ezdashing.consumer.Consumer register(java.lang.String queryId) {
    java.util.Optional<com.thorpora.ezdashing.dashboard.model.DataSource> dataSource = dashboardProperties.getDataSource(queryId);
    if (!(dataSource.isPresent())) {
        throw new com.thorpora.ezdashing.consumer.ConsumerException((("consumer " + queryId) + " doesn't exist in dashboard.json"));
    }
    com.thorpora.ezdashing.dashboard.model.DataSource ds = dataSource.get();
    com.thorpora.ezdashing.consumer.Consumer consumer = new com.thorpora.ezdashing.consumer.Consumer(ds);
    for (com.thorpora.ezdashing.dashboard.model.DataSourceQuery query : ds.getQueries()) {
        consumers.put(query.getId(), consumer);
    }
    return consumer;
}