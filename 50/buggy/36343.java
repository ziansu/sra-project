@org.jetbrains.annotations.Nullable
public static org.elixir_lang.beam.Beam from(@org.jetbrains.annotations.NotNull
byte[] content) throws com.ericsson.otp.erlang.OtpErlangDecodeException, java.io.IOException {
    return org.elixir_lang.beam.Beam.from(new java.io.DataInputStream(new java.io.ByteArrayInputStream(content)));
}