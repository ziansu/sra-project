private void client_create_configuration() {
    this.naive_approach = false;
    this.client_predict = true;
    this.input_seq = 0;
    this.client_smoothing = true;
    this.client_smooth = 25;
    this.net_latency = 0L;
    this.net_ping = 0L;
    this.last_ping_time = 0L;
    this.fake_lag = 0L;
    this.net_offset = 100;
    this.buffer_size = 2;
    this.target_time = 0.01F;
    this.oldest_tick = 0.01F;
    this.client_time = 0.01F;
    this.server_time = 0.01F;
}